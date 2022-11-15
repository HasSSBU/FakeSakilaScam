import React, { useEffect } from 'react';
import {useState} from 'react';
import { BrowserRouter, Route, Link } from 'react-router-dom';

function GetFilmForPayment(props){
    var Reference = "http://localhost:8080/Home/Film/" + props.Id;
    const [Error, SetError] = useState(null);
    const [Title, SetTitle] = useState("");
    const [RentRate, SetRentRate] = useState("");
    const [Rating, SetRating] = useState("");

    useEffect(() => {
        fetch(Reference)
        .then(Res => Res.json())
        .then(Film =>{
            SetTitle(Film.title);
            SetRentRate(Film.rentalRate);
            SetRating(Film.rating);
        },
        Error => {
            SetError(Error);
        }
        )
    },[])
    if(Error){
        return(
            <div>Could not load API, null values Found</div>
        )
    }else{
        return(
            <div>
                <div id="title">{Title}</div>
                <div id="rentRate">{RentRate}</div>
                <div id="rating">{Rating}</div>
                <form >
                    <label>
                        How long would you like to rent this film?
                        <input type='text'/>
                        <br></br>
                        Card Number: 
                        <input type="text"/>
                        <br></br>
                        Expiry Month: 
                        <input type="text" />
                        <br></br>
                        Expiry Year: 
                        <input type="text" />
                        <br></br>            
                        Security Code: 
                        <input type="text" />
                    </label>
                    <br></br>
                    <Link to={"/EndPage/"}><input type="submit" value="Submit" /> </Link>
                </form>
            </div>
        )
    }
}

export default GetFilmForPayment;