import { HistoryComponent } from './modules/history/history.component';
import { CalculatorComponent } from './modules/calculator/calculator.component';
import { LoginComponent } from './modules/login/login.component';
import { FullwidthComponent } from './layouts/fullwidth/fullwidth.component';
import { HomeComponent } from './modules/home/home.component';
import { DefaultComponent } from './layouts/default/default.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
    path: '',
    component: DefaultComponent,
    children: [
      { path: '', component: HomeComponent },
      { path: 'Calculator', component: CalculatorComponent },
      { path: 'History', component: HistoryComponent },
    ],
  },
  {
    path: '',
    component: FullwidthComponent,
    children: [{ path: 'Login', component: LoginComponent }],
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
