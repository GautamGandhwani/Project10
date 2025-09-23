import { Component } from '@angular/core';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';
import { BaseListCtl } from '../base-list.component';

@Component({
  selector: 'app-marksheet-list',
  templateUrl: './marksheet-list.component.html'
})
export class MarksheetListComponent extends BaseListCtl{

  constructor(public locator:ServiceLocatorService,router:ActivatedRoute){
    super(locator.endpoints.MARKSHEET,locator,router);
  }
}
