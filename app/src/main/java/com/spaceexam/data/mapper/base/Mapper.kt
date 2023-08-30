package com.spaceexam.data.mapper.base

interface Mapper<in ModelA, out ModelB> {
    operator fun invoke(model: ModelA): ModelB
}