import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css'],
})
export class CalculatorComponent implements OnInit {
  isUserUnKnown: boolean;
  showAddValueToProfile: boolean = false;

  height?: number = undefined;
  weight?: number = undefined;
  birthDay?: string = undefined;

  bmiValue?: number;
  personalInformation: string = '';

  constructor() {
    this.isUserUnKnown = true;
    if (!this.isUserUnKnown) {
      //initialize weight and height
    }
  }

  ngOnInit(): void {}

  CalculateBMI() {
    console.log(this.weight);
    console.log(this.height);
    console.log(this.birthDay);

    //TODO check for valid input
    var height = this.height ?? 1; //TODO
    var weight = this.weight ?? 1; //TODO
    var birthDay = new Date(this.birthDay ?? ''); //TODO

    var today = new Date();
    var age = today.getFullYear() - birthDay.getFullYear();
    var monthDifference = today.getMonth() - birthDay.getMonth();
    if (
      monthDifference < 0 ||
      (monthDifference == 0 && today.getDate() < birthDay.getDate())
    )
      age--;

    console.log(age);
    var heightInMeter = height / 100;
    var bmiValue = weight / Math.pow(heightInMeter, 2);
    var roundedBmiValue = Math.round(bmiValue * 100) / 100;
    this.bmiValue = roundedBmiValue;
    this.showAddValueToProfile =
      roundedBmiValue != undefined && !this.isUserUnKnown;
    this.personalInformation = this.GetPersonalInformation(
      roundedBmiValue,
      age
    );
  }

  GetPersonalInformation(bmiValue: number, age: number) {
    var information: string = '';
    if (bmiValue < 18.5) {
      information += 'You weight too little.';
    } else if (bmiValue < 24.9) {
      information += 'You have a normal weight.';
    } else if (bmiValue < 29.9) {
      information += 'You weight a little too much.';
    } else {
      information += 'You weight a little too much.';
    }
    if (age < 19) return information;

    var normalWeight: boolean =
      (age <= 24 && 19 <= bmiValue && bmiValue <= 24) ||
      (25 <= age && age <= 34 && 20 <= bmiValue && bmiValue <= 25) ||
      (35 <= age && age <= 44 && 21 <= bmiValue && bmiValue <= 26) ||
      (45 <= age && age <= 54 && 22 <= bmiValue && bmiValue <= 27) ||
      (55 <= age && age <= 65 && 23 <= bmiValue && bmiValue <= 28) ||
      (66 <= age && 24 <= bmiValue && bmiValue <= 29);

    if (normalWeight) {
      information += ' You are at a normal weight according to your age!';
      return information;
    }
    information += ' You are not at a normal weight according to your age!';
    return information;
  }

  AddToProfile() {
    console.log('Add to Profile');
  }
}
