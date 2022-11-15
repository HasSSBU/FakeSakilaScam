import React, { useEffect } from 'react';
import {useState} from 'react';
import { BrowserRouter, Route, Link } from 'react-router-dom';

function GetFilmForPayment(props){
    var reference = "http://localhost:8080/Home/Film/" + props.Id;
    const [error, setError] = useState(null);
    const [title, setTitle] = useState("");
    const [rentRate, setRentRate] = useState("");
    const [rating, setRating] = useState("");

    useEffect(() => {
        fetch(reference)
        .then(res => res.json())
        .then(Film =>{
            setTitle(Film.title);
            setRentRate(Film.rentalRate);
            setRating(Film.rating);
        },
        error => {
            setError(error);
        }
        )
    },[])
    if(error){
        return(
            <div>Could not load API, null values Found</div>
        )
    }else{
        return(
            <div>
                <div id="title">{title}</div>
                <div id="rentRate">{rentRate}</div>
                <div id="rating">{rating}</div>
                <form>

                    <button>Confrim Payment</button>
                </form>
                
            </div>
        )
    }
}

export default GetFilmForPayment;