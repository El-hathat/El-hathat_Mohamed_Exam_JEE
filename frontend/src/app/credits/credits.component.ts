import { Component, OnInit } from '@angular/core';
import {CreditService} from '../credit.service';
import {CommonModule, CurrencyPipe, DatePipe} from '@angular/common';
import {HttpClient} from '@angular/common/http';


@Component({
  selector: 'app-credits',
  templateUrl: './credits.component.html',
  imports: [
    CurrencyPipe,
    DatePipe,
    CommonModule
  ]
})
export class CreditsComponent implements OnInit {
  credits: any[] = [];

  constructor(private creditService: CreditService) {}

  ngOnInit(): void {
    this.loadCredits();
  }

  loadCredits(): void {
    this.creditService.getCredits().subscribe((data) => {
      this.credits = data;
    });
  }
}
