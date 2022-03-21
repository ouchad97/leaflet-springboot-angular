import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import * as L from 'leaflet';
import { PopupService } from './popup.service';
import { environment } from 'src/environments/environment';
 
 


@Injectable({
  providedIn: 'root'
})
export class MarkerService { 

private baseUrl =  `${environment.apiUrl}/devices`; 

  constructor(private http: HttpClient,
    private popupService: PopupService) {
  }

  
  makeCapitalMarkers(map: L.Map): void {
    this.http.get(this.baseUrl).subscribe((res: any) => {
      
      for (var c of res) {
        var lon = c.longitude;
        var lat = c.latitude;
        var marker = L.marker([lat, lon]);
        marker.bindPopup(this.popupService.makeCapitalPopup(c));
        marker.addTo(map).on('dragend', function() {
          var coord = String(marker.getLatLng()).split(',');
          console.log(coord);
          var lat = coord[0].split('(');
          console.log(lat);
          var lng = coord[1].split(')');
          console.log(lng);
          marker.bindPopup("Moved to: " + lat[1] + ", " + lng[0] + ".");
        });
           

        /* 
         const marker = L.marker([lat, lon]);
        marker.bindPopup(this.popupService.makeCapitalPopup(c));
        marker.addTo(map);
         
        */


      /*  var polylinePoints =  [ new L.LatLng(lat, lon)];
        
        var polylineOptions = {
          color: 'blue',
          weight: 6,
          opacity: 0.9
        };

        var polyline = new L.Polyline(polylinePoints, polylineOptions); 
         
         // zoom the map to the polyline
         map.fitBounds(polyline.getBounds());
         //polyline.bindPopup(this.popupService.makeCapitalPopup(c));

         polyline.addTo(map);*/

      }
    });
  }
 
}