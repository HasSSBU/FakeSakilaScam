import React, { useEffect } from 'react';
import {useState} from 'react';
import { BrowserRouter, Route, Link, useNavigate } from 'react-router-dom';
import './index.css';

function GetFilmForPayment(Props){
    var Reference = "https://sakilascam-1668596780924.azurewebsites.net//Home/Film/" + Props.Id;
    const [Error, SetError] = useState(null);
    const [Id, SetId] = useState("");
    const [Title, SetTitle] = useState("");
    const [RentRate, SetRentRate] = useState("");
    const [Rating, SetRating] = useState("");
    const [Input, SetInput] = useState("");
    const [Navigation, SetNavigate] = useState(false);
    const [Hours, SetHours] = useState(null);

    console.log(Input);
    let Navigate = useNavigate();


    const handleSubmit = event => {
    console.log('handleSubmit ran');
    event.preventDefault();
    SetNavigate(true);
    }


    useEffect(() => {
        
        if(Navigation){
            SetHours(Input)
            console.log(Hours);
            return(Navigate("/EndPage/"+Id, {state: Input}))
        }
        fetch(Reference)
        .then(Res => Res.json())
        .then(Film =>{
            SetId(Film.filmId);
            SetTitle(Film.title);
            SetRentRate(Film.rentalRate);
            SetRating(Film.rating);

        },
        Error => {
            SetError(Error);
        }
        )
    },[Navigation, Navigate])
    if(Error){
        return(
            <div>Could not load API, null values Found</div>
        )
    }else{
        return(
            <div>
                <h1>Please Note this website does not exist! Do not put in any real card details!</h1>
                <div id="title">You will be renting: {Title} ({Rating})</div>
                <div id="rentRate">For the amount:  {RentRate}</div>
                <hr></hr>
                <form id='FilmInfo' onSubmit={handleSubmit}>
                    <label>
                        How long would you like to rent this film? (In Hours)
                        <br></br>
                        <input type='text'
                        name ="Input"
                        onChange= {e => SetInput(e.target.value)}
                        />
                        <br></br>
                        Card Number:
                        <br></br>
                        <input type="text"/>
                        <br></br>
                        Expiry Month:
                        <br></br>
                        <input type="text" />
                        <br></br>
                        Expiry Year: 
                        <br></br>
                        <input type="text" />
                        <br></br>            
                        Security Code:
                        <br></br>
                        <input type="text" />
                    </label>
                    
                    <br></br>
                    <input type="submit" value="Submit"/>
                </form>
            </div>
        )
    }
}

export default GetFilmForPayment;