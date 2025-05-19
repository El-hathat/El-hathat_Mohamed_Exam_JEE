import { Component, OnInit } from '@angular/core';
import {ClientService} from '../client.service';
import {CommonModule} from '@angular/common';


@Component({
  selector: 'app-clients',
  imports:[CommonModule],
  templateUrl: './clients.component.html',
  styleUrl: './clients.component.css'
})
export class ClientsComponent implements OnInit {
  clients: any[] = [];

  constructor(private clientService: ClientService) {}

  ngOnInit(): void {
    this.loadClients();
  }

  loadClients(): void {
    this.clientService.getClients().subscribe((data) => {
      this.clients = data;
    });
  }
}
