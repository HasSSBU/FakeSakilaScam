import React from 'react';
import { BrowserRouter, Route, Link } from 'react-router-dom';
import Logo from './logo.png';
import './index.css';


const NavBar = () => {
    
    return(
        <nav>
            <Link to="/"><img src = {Logo} /></Link>
            <div>
            
                <p id='subtitle'>Rent Fantastic Films!</p>
                {/* <Link to={"/ExtraPage/"}>
                    <div>Test Addtional API calls here</div>
                </Link> */}
                <hr></hr>
            </div>            
        </nav>
    );
}

export default NavBar;