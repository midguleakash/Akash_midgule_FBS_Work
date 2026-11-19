import TextField from '@mui/material/TextField';
import Button from '@mui/material/Button';
import { useState } from 'react';
import "./SearchBox.css"

export default function SearchBox({ updateInfo }) {

    const API_URL = "https://api.openweathermap.org/data/2.5/weather";
    const API_KEY = "56848717d018e802ce0f2b2e4f503a3c";
    let [city, setCity] = useState("");
    let [error, setError] = useState(false)

    let getWhetherInfo = async (city) => {

        try {
            const response = await fetch(`${API_URL}?q=${city}&appid=${API_KEY}&units=  metric`);
            let jsonResponse = await response.json();

            let result = {
                city: city,
                temp: jsonResponse.main.temp,
                tempMin: jsonResponse.main.temp_min,
                tempMax: jsonResponse.main.temp_max,
                humidity: jsonResponse.main.humidity,
                weather: jsonResponse.weather[0].description,
            }
            return result;
        } catch (error) {
            throw error
        }


    }

    let handleChange = (event) => {
        setCity(event.target.value)
    }

    let handleSubmit = async (event) => {
        try {
            event.preventDefault();
            console.log(city);
            setCity("");
            let info = await getWhetherInfo(city)
            updateInfo(info)
        } catch (err) {
            setError(true)
        }

    }
    return (
        <div className='SearchBox'>
            <h3>Search for the weather</h3>
            <form action="" onSubmit={handleSubmit}>
                <TextField id="outlined-basic" label="City Name" variant="outlined" onChange={handleChange} value={city} required />
                <br /><br />
                <Button variant="contained" type='submit' >Search</Button>

                {error && <p style={{color:"red"}} >No such place exixt</p>}
            </form>
        </div>
    )
}