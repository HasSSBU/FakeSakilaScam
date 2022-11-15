import React from 'react';
import { useParams } from 'react-router-dom';
import GetFilmForPayment from '../FilmPayment.js';

function PaymentPage(){
    let param = useParams();
    return(
        <div>
            <GetFilmForPayment Id={param.Id}/> 
        </div>
    );
}

export default PaymentPage;