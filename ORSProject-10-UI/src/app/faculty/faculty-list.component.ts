import { Component } from '@angular/core';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';
import { BaseListCtl } from '../base-list.component';

@Component({
  selector: 'app-faculty-list',
  templateUrl: './faculty-list.component.html'
})
export class FacultyListComponent extends BaseListCtl{

  constructor(public locator:ServiceLocatorService,router:ActivatedRoute){
    super(locator.endpoints.FACULTY,locator,router);
  }
}
