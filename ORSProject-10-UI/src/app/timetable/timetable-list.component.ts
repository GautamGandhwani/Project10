import { Component } from '@angular/core';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';
import { BaseListCtl } from '../base-list.component';

@Component({
  selector: 'app-timetable-list',
  templateUrl: './timetable-list.component.html'
})
export class TimetableListComponent extends BaseListCtl{

  constructor(public locator :ServiceLocatorService,router:ActivatedRoute){
    super(locator.endpoints.TIMETABLE,locator,router);
  }
}
