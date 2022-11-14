import React, { useEffect } from 'react';
import {useState} from 'react';

function GetFilm(){
    const [error, setError] = useState(null);
    const [films, setFilms] = useState("");

    useEffect(() => {
        fetch("http://localhost:8080/Home/FilmName/2")
        .then(res => res.json())
        .then(Film =>{
            setFilms(Film.title);
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
            <div>Films
                <br></br>
                <div id="Films">{films}</div>
            </div>
        )
    }
}

export default GetFilm;