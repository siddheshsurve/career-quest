import React from 'react'
import { AppBar, Toolbar, styled } from "@mui/material";
import appLogo from "./app-logo3.png"

const StyledAppBar = styled(AppBar)( {
    background: "#2d2d2d",
    height: 74
})

const Header = () => {

    const logo = "https://get-staffed.com/wp-content/uploads/2020/07/indeed-logo.png";

  return (
    <StyledAppBar>
        <Toolbar>
            <img src={appLogo} alt='logo' width="75px" height="75px" />
            Post a Job
            Find Jobs
        </Toolbar>
    </StyledAppBar>
  )
}

export default Header