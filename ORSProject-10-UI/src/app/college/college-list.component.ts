import { Component } from '@angular/core';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';
import { BaseListCtl } from '../base-list.component';

@Component({
  selector: 'app-college-list',
  templateUrl: './college-list.component.html'
})
export class CollegeListComponent extends BaseListCtl{

  constructor(public locator:ServiceLocatorService,router:ActivatedRoute){
    super(locator.endpoints.COLLEGE,locator,router);
  }
}
