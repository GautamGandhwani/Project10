import { Component } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html'
})
export class StudentComponent extends BaseCtl{

  constructor(public locator:ServiceLocatorService,router:ActivatedRoute){
    super(locator.endpoints.STUDENT,locator,router);
  }
}
