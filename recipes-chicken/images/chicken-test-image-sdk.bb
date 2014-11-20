inherit core-image

require recipes-chicken/images/all-chicken-egg-recipes.inc

IMAGE_FEATURES += "tools-sdk dev-pkgs tools-debug"

CORE_IMAGE_EXTRA_INSTALL += "\
    chicken \
    ${ALL_CHICKEN_EGG_RECIPES} \
"
