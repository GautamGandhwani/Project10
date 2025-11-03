import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HTTP_INTERCEPTORS, HttpClient, HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { HttpServiceService } from './http-service.service';
import { EndpointServiceService } from './endpoint-service.service';
import { ServiceLocatorService } from './service-locator.service';
import { AuthServiceService } from './auth-service.service';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './login/signup.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { NavbarComponent } from './navbar/navbar.component';
import { UserComponent } from './user/user.component';
import { UserListComponent } from './user/user-list.component';
import { RoleComponent } from './role/role.component';
import { RoleListComponent } from './role/role-list.component';
import { CollegeComponent } from './college/college.component';
import { CollegeListComponent } from './college/college-list.component';
import { StudentComponent } from './student/student.component';
import { StudentListComponent } from './student/student-list.component';
import { MarksheetComponent } from './marksheet/marksheet.component';
import { MarksheetListComponent } from './marksheet/marksheet-list.component';
import { CourseComponent } from './course/course.component';
import { CourseListComponent } from './course/course-list.component';
import { SubjectComponent } from './subject/subject.component';
import { SubjectListComponent } from './subject/subject-list.component';
import { TimetableComponent } from './timetable/timetable.component';
import { TimetableListComponent } from './timetable/timetable-list.component';
import { FacultyComponent } from './faculty/faculty.component';
import { FacultyListComponent } from './faculty/faculty-list.component';
import { FooterComponent } from './footer/footer.component';
import { MyprofileComponent } from './user/myprofile.component';
import { ChangepasswordComponent } from './user/changepassword.component';
import { ForgotpasswordComponent } from './login/forgotpassword.component';
import { TranslateLoader, TranslateModule } from '@ngx-translate/core';
import { TranslateHttpLoader } from '@ngx-translate/http-loader';

export function myHttpLoader(http: HttpClient) {
  return new TranslateHttpLoader(http, './assets/i18n/', '.json');
}

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    SignupComponent,
    DashboardComponent,
    NavbarComponent,
    UserComponent,
    UserListComponent,
    RoleComponent,
    RoleListComponent,
    CollegeComponent,
    CollegeListComponent,
    StudentComponent,
    StudentListComponent,
    MarksheetComponent,
    MarksheetListComponent,
    CourseComponent,
    CourseListComponent,
    SubjectComponent,
    SubjectListComponent,
    TimetableComponent,
    TimetableListComponent,
    FacultyComponent,
    FacultyListComponent,
    FooterComponent,
    MyprofileComponent,
    ChangepasswordComponent,
    ForgotpasswordComponent
  ],
  imports: [
    BrowserModule,
    TranslateModule.forRoot({
      loader: {
        provide: TranslateLoader,
        useFactory: myHttpLoader,
        deps: [HttpClient]
      }
    }),
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [
    HttpServiceService,
    EndpointServiceService,
    ServiceLocatorService,
    AuthServiceService,
    { provide: HTTP_INTERCEPTORS, useClass: AuthServiceService, multi: true }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }