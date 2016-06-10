inherit core-image populate_sdk_chicken

require recipes-chicken/images/all-chicken-egg-recipes.inc

CORE_IMAGE_EXTRA_INSTALL += "\
    chicken \
    ${ALL_CHICKEN_EGG_RECIPES} \
"

# Includes all native eggs inside of the toolchain
TOOLCHAIN_HOST_TASK_append = " ${ALL_NATIVESDK_CHICKEN_EGG_RECIPES}"
