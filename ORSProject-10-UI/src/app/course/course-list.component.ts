import { Component } from '@angular/core';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';
import { BaseListCtl } from '../base-list.component';

@Component({
  selector: 'app-course-list',
  templateUrl: './course-list.component.html'
})
export class CourseListComponent extends BaseListCtl{

  constructor(public locator:ServiceLocatorService,router:ActivatedRoute){
    super(locator.endpoints.COURSE,locator,router);
  }
}
