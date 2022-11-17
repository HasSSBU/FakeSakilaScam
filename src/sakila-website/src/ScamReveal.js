import React from 'react';
import { useEffect } from 'react';
import {useState} from 'react';
import './index.css';

function ScamBody(Props){
    var Reference = "https://sakilascam-1668596780924.azurewebsites.net//Home/Film/" + Props.Id;
    const [Title, SetTitle] = useState("");
    const [RentRate, SetRentRate] = useState("");
    
    let total = RentRate * Props.Input;
    console.log(total);
    console.log(Props.Input);
    useEffect(() => {
        fetch(Reference)
        .then(Res => Res.json())
        .then(Film =>{
            SetTitle(Film.title);
            console.log(Film);
            SetRentRate(Film.rentalRate);
        })
    }
    
    );
    


    return(
        <div>
            <div id='FilmInfo'>
                You are now renting:
                <br></br>
                <b>{Title}</b>
                <br></br>
                For:
                <br></br>
                <b>£{total.toFixed(2)}</b>
                <br></br>
                Enjoy your film!
            </div>
        </div>
    )
}

export default ScamBody;