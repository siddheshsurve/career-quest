import React from 'react'
import Header from '../components/Header'
import { Box, Typography, styled } from '@mui/material';

const Component = styled(Box) ({
    padding: '80px 200px',
    background: '#F5F5F5'
})

const CreatePost = () => {

    const image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTH3zkKYlIHjjoQrE4e-a5xiJIaK0reWlcDhewsx8rjV87d8M82";

  return (
    <>
        <Header />
        <Component>
            <Box>
                <Typography>Create a Job Post</Typography>
                <img src={image} alt='create' />
            </Box>
            <Box>
                
            </Box>
        </Component>
    </>
  )
}

export default CreatePost