inherit core-image

require recipes-chicken/images/all-chicken-egg-recipes.inc

CORE_IMAGE_EXTRA_INSTALL += "\
    chicken \
    ${ALL_CHICKEN_EGG_RECIPES} \
"
