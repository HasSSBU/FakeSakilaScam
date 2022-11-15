import React from 'react';
import { BrowserRouter, Route, Link } from 'react-router-dom';
import logo from './logo.png';
import GetFilm from './SpecificFilmAPI';


const NavBar = () => {
    
    return(
        <nav>
            <Link to="/"><img src = {logo} /></Link>
            <div>
            
                <i>         Rent Fantastic Films!</i>
                <hr></hr>
            </div>
                
            <Link to="/PaymentPage">PaymentPage</Link>
             
        </nav>
    );
}

export default NavBar;