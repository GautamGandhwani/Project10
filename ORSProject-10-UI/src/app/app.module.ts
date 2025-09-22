import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { HttpServiceService } from './http-service.service';
import { EndpointServiceService } from './endpoint-service.service';
import { ServiceLocatorService } from './service-locator.service';
import { AuthServiceService } from './auth-service.service';
import { LoginComponent } from './login/login.component';
import { SingupComponent } from './login/singup.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { NavbarComponent } from './navbar/navbar.component';
import { UserComponent } from './user/user.component';
import { UserListComponent } from './user/user-list.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    SingupComponent,
    DashboardComponent,
    NavbarComponent,
    UserComponent,
    UserListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [
    HttpServiceService,
    EndpointServiceService,
    ServiceLocatorService,
    AuthServiceService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
