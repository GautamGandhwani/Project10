import { Component } from '@angular/core';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';
import { BaseListCtl } from '../base-list.component';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html'
})
export class StudentListComponent extends BaseListCtl{

  constructor(public locator:ServiceLocatorService,router:ActivatedRoute){
    super(locator.endpoints.STUDENT,locator,router);
  }
}
