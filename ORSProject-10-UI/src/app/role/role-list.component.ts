import { Component } from '@angular/core';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';
import { BaseListCtl } from '../base-list.component';


@Component({
  selector: 'app-role-list',
  templateUrl: './role-list.component.html'
})
export class RoleListComponent extends BaseListCtl{

  constructor(locator:ServiceLocatorService, router:ActivatedRoute){
    super(locator.endpoints.ROLE,locator,router);
  }
}
