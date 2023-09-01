import React from 'react'
import Header from '../components/Header'
import { useEffect } from 'react'
import { getAllPosts } from '../services/api'

const AllPost = () => {

    useEffect(() => {
        const getData = async() => {
            await getAllPosts();
        }
        getData();
    }, [])

  return (
    <>
        <Header />

    </>
  )
}

export default AllPost