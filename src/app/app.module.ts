import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { HttpClientModule } from '@angular/common/http';
import { MarkerService } from './marker.service';
import { PopupService} from './popup.service';

import { AppComponent } from './app.component';
import { MapComponent } from './map/map.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

@NgModule({
  declarations: [
    AppComponent,
    MapComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    BrowserAnimationsModule
  ],
  providers: [
    MarkerService,
    PopupService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
