import {NgModule} from "@angular/core";
import {
  MdcButtonModule,
  MdcFabModule,
  MdcIconModule,
  MdcMenuModule,
  MdcTopAppBarModule,

} from "@angular-mdc/web";

@NgModule({
  exports: [
    MdcButtonModule,
    MdcFabModule,
    MdcIconModule,
    MdcMenuModule,
    MdcTopAppBarModule,

  ]
})
export class MaterialModule{}
