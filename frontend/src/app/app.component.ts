import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {HeaderComponent} from './header/header.component';
import {ClientsComponent} from './clients/clients.component';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, HeaderComponent, ClientsComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'frontend';
}
