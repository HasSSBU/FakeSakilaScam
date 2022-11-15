import React, { useEffect } from 'react';
import {useState} from 'react';
import { BrowserRouter, Route, Link } from 'react-router-dom';

function GetFilm(props){
    var reference = "http://localhost:8080/Home/Film/" + props.Id;
    const [error, setError] = useState(null);
    const [id, setId] = useState("");
    const [title, setTitle] = useState("");
    const [desc, setDesc] = useState("");
    const [rentRate, setRentRate] = useState("");
    const [rating, setRating] = useState("");
    const [actors, setActors] = useState([]);
    const [categories, setCategories] = useState([]);


    function LoadActors(){
        const actorContent = [];
        actors.forEach(element => {
            actorContent.push(
            <><div>
                {element.firstName} {element.lastName}   
            </div></>)
        });
        return(
            actorContent
        );
    }

    function LoadCategories(){
        const categoryContent = [];
        categories.forEach(element => {
            categoryContent.push(
            <><div>
                {element.name}
            </div></>)
        });
        return(
            categoryContent
        );
    }
    

    useEffect(() => {
        fetch(reference)
        .then(res => res.json())
        .then(Film =>{
            setTitle(Film.title);
            setDesc(Film.description);
            setRentRate(Film.rentalRate);
            setRating(Film.rating);
            setActors(Film.actorIds);
            setCategories(Film.categories);
            setId(Film.filmId);

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
                <div id="desc">{desc}</div>
                <div id="rentRate">{rentRate}</div>
                <div id="rating">{rating}</div>
                <div>{actors !== [] ? LoadActors() : null}</div>
                <div>{actors !== [] ? LoadCategories() : null}</div>
                <Link to={"/PaymentPage/" + id}>
                    <button>Rent Me!</button>
                </Link>
            </div>
        )
    }
}

export default GetFilm;