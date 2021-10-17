import { HistoryComponent } from './../../modules/history/history.component';
import { FormsModule } from '@angular/forms';
import { CalculatorComponent } from './../../modules/calculator/calculator.component';
import { CoreModule } from '../../core/core.module';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FlexLayoutModule } from '@angular/flex-layout';
import { HomeComponent } from './../../modules/home/home.component';
import { DefaultComponent } from './default.component';
import { RouterModule } from '@angular/router';

@NgModule({
  declarations: [
    DefaultComponent,
    HomeComponent,
    CalculatorComponent,
    HistoryComponent,
  ],
  imports: [
    CommonModule,
    RouterModule,
    FlexLayoutModule,
    CoreModule,
    FormsModule,
  ],
})
export class DefaultModule {}
