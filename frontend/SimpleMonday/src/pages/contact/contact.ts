import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
import { Http } from '@angular/http';

import 'rxjs/add/operator/map';


@Component({
  selector: 'page-contact',
  templateUrl: 'contact.html'
})

export class ContactPage {
  people: any;

  constructor(public navCtrl: NavController, public http: Http) {
    this.http.get('http://localhost:8080/persons').map(res => res.json()).subscribe(data => {
        //console.log(data);
        this.people = data._embedded.persons;
    });

  }

}
