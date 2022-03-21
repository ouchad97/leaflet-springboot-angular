import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class PopupService {

  constructor() { }

  makeCapitalPopup(data: any): string { 
    return `` +
      `<div>Date: ${ data.date }</div>` +
      `<div>deviceId: ${ data.deviceId }</div>`
  }
}
