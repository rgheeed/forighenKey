
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomeComponent } from './home/home.component';
import { IndiComponent } from './indi/indi.component';

import { EduComponent } from './edu/edu.component';
import { EducationFormComponent } from './admin/education-form/education-form.component';
import { CompanyFormComponent } from './admin/company-form/company-form.component';
import { AdminPageComponent } from './admin/admin-page/admin-page.component';
import { CompanyListComponent } from './admin/company-list/company-list.component';
import { NavbarComponent } from './navbar/navbar.component';
import { IndiFormComponent } from './admin/indi-form/indi-form.component';
import { EduListComponent } from './admin/edu-list/edu-list.component';
import { IndiListComponent } from './admin/indi-list/indi-list.component';
import { ComComponent } from './com/com.component';
import { Error404Component } from './error404/error404.component';
import { LogoutComponent } from './logout/logout.component';
import { RouteGuardService } from './service/route-guard.service';
 
const routes: Routes = [


  {path:'' ,component:HomeComponent},
  {path:'home' ,component:HomeComponent},
{path:'indi',component:IndiComponent},
{path:'com' ,component:ComComponent},
{path:'edu',component:EduComponent},
{path:'nav',component:NavbarComponent},
//canActivate:[RouteGuardService]



  { path: 'admin', component: AdminPageComponent },
  { path: 'companyList', component: CompanyListComponent},
  { path: 'addcompany', component: CompanyFormComponent},
  { path: 'addeducation', component: EducationFormComponent },
  {path:'addIndi', component:IndiFormComponent},
  {path:'eduList' , component:EduListComponent},
  {path:'indiList',component:IndiListComponent},
  {path:'logout', component:LogoutComponent},
  {path:'**' , component:Error404Component,}
];
 
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
  
 }