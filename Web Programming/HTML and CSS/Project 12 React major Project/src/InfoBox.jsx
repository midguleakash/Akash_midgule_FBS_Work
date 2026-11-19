import Card from '@mui/material/Card';
import CardContent from '@mui/material/CardContent';
import CardMedia from '@mui/material/CardMedia';
import Typography from '@mui/material/Typography';
import "./InfoBox.css"

export default function InfoBox({info}) {
    return (
        <div className="InfoBox">
            <h1>Weather Information</h1>
            <div className='cardContainer'>
                <Card sx={{ maxWidth: 645 }}>
                    <CardMedia
                        sx={{ height: 140 }}
                        image="https://images.unsplash.com/photo-1741850821397-ed0e5d9bc125?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxmZWF0dXJlZC1waG90b3MtZmVlZHwxMHx8fGVufDB8fHx8fA%3D%3D"
                        title="green iguana"
                    />
                    <CardContent>
                        <Typography gutterBottom variant="h5" component="div">
                            {info.city}
                        </Typography>
                        <Typography variant="body2" sx={{ color: 'text.secondary' }} component={"span"}>
                            <p>Temprature: {info.temp}&deg;C</p>
                            <p>Humidity: {info.humidity}</p>
                            <p>Min Temprature: {info.tempMin}&deg;C</p>
                            <p>Max Temprature: {info.tempMax}&deg;C</p>
                            <p>weather: {info.weather}</p>
                        </Typography>
                    </CardContent>

                </Card>
            </div>
        </div>
    )
}