package io.armory.plugin.stage.pulumi

/**
 * This the the part of the Context map that we care about as input to the stage execution.
 * The data can be key/value pairs or an entire configuration tree.
 */
data class PulumiInput(
        var cloudProvider: String,
        var githubRepository: String,
        var githubBranch: String
)