import { FullwidthModule } from './layouts/fullwidth/fullwidth.module';
import { DefaultModule } from './layouts/default/default.module';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

@NgModule({
  declarations: [AppComponent],
  imports: [BrowserModule, AppRoutingModule, DefaultModule, FullwidthModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
