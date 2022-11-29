import logo from './logo.svg';
import './App.css';
import { Component } from 'react';
import { UserService } from './UserService';

export default class App extends Component {

constructor(){
  super();
  this.userService = new UserService();
}

 componentDidMount() {
    this.userService.getAll().then((data) => console.log(data));

  }

  render() {
    return (
      <div>hola mundo cruel</div>
    );
  }
}