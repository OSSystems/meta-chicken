include recipes-chicken/images/chicken-test-image.bb

IMAGE_FEATURES += "dev-pkgs \
                   tools-sdk \
                   tools-debug \
                   tools-profile \
                   tools-testapps \
                   ssh-server-openssh"

# Includes all native eggs inside of the toolchain
TOOLCHAIN_HOST_TASK_append = " ${ALL_NATIVESDK_CHICKEN_EGG_RECIPES}"
