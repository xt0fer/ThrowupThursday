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
    // one could, and might, make this a provider, and inject it vi changes to this constructor.
    this.http.get('http://localhost:8080/persons').map(res => res.json()).subscribe(data => {
        //console.log(data);
        if (data.status == 200) {
          this.people = data._embedded.persons;
        } else {
          this.people = [{name: 'Unable to Find Any People!', age: 0}];
        }
    });

  }

}
