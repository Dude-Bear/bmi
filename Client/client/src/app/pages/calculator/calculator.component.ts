import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css'],
})
export class CalculatorComponent implements OnInit {
  title: string = 'BMI-Calculator';
  result: string = '';
  isKnownUser: boolean;
  
  weight?:number =40;
  height?:number =187;
  birthDay: string = '';

  constructor() {
    this.isKnownUser = true;
  }

  ngOnInit(): void {}

  CalculateBMI() {
    console.log(this.weight);
    console.log(this.height);
    this.result = String((this.weight?? 0) + (this.height?? 0));
  }
}
