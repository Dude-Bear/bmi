import { FlexLayoutModule } from '@angular/flex-layout';
import { FooterComponent } from './components/footer/footer.component';
import { SidebarComponent } from './components/sidebar/sidebar.component';
import { HeaderComponent } from './components/header/header.component';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [HeaderComponent, SidebarComponent, FooterComponent],
  imports: [CommonModule, RouterModule, FlexLayoutModule, HttpClientModule],
  exports: [HeaderComponent, SidebarComponent, FooterComponent],
})
export class CoreModule {}
