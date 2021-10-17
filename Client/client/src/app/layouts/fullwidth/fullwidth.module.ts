import { LoginComponent } from './../../modules/login/login.component';
import { CoreModule } from '../../core/core.module';
import { FlexLayoutModule } from '@angular/flex-layout';
import { RouterModule } from '@angular/router';
import { FullwidthComponent } from './fullwidth.component';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

@NgModule({
  declarations: [FullwidthComponent, LoginComponent],
  imports: [CommonModule, RouterModule, FlexLayoutModule, CoreModule],
})
export class FullwidthModule {}
