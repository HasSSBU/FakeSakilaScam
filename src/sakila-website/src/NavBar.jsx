import React from 'react';
import { BrowserRouter, Route, Link } from 'react-router-dom';
import Logo from './logo.png';


const NavBar = () => {
    
    return(
        <nav>
            <Link to="/"><img src = {Logo} /></Link>
            <div>
            
                <i>         Rent Fantastic Films!</i>
                <Link to={"/ExtraPage/"}>
                    <div>Test Addtional API calls here</div>
                </Link>
                <hr></hr>
            </div>            
        </nav>
    );
}

export default NavBar;