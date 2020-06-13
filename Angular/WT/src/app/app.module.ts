
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import {HttpClientModule} from '@angular/common/http';
import { CompanyFormComponent } from './admin/company-form/company-form.component';
import { CompanyListComponent } from './admin/company-list/company-list.component';
import { EducationFormComponent } from './admin/education-form/education-form.component';
import { AdminPageComponent } from './admin/admin-page/admin-page.component';
import { CompanyServiceService } from './admin/company-service.service';
import { HomeComponent } from './home/home.component';
import { IndiComponent } from './indi/indi.component';
import { FooterComponent } from './footer/footer.component';

import { EduComponent } from './edu/edu.component';
import { NavbarComponent } from './navbar/navbar.component';
import { IndiFormComponent } from './admin/indi-form/indi-form.component';
import { EduListComponent } from './admin/edu-list/edu-list.component';
import { IndiListComponent } from './admin/indi-list/indi-list.component';
import { ComComponent } from './com/com.component';
import { Error404Component } from './error404/error404.component';
import { LogoutComponent } from './logout/logout.component';


/* import { IndividualFormComponent } from './individual-form/individual-form.component'; */





@NgModule({
  declarations: [
    AppComponent,
    CompanyFormComponent,
    CompanyListComponent,
    EducationFormComponent,
    AdminPageComponent,
  
    HomeComponent,
    IndiComponent,
    FooterComponent,
    
    EduComponent,
    NavbarComponent,
    IndiFormComponent,
    EduListComponent,
    IndiListComponent,
    ComComponent,
    Error404Component,
    LogoutComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    

    HttpClientModule,
    FormsModule
  ],

  
  providers: [CompanyServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }



