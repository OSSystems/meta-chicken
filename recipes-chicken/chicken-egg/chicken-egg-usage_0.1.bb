SECTION = "devel/chicken"
DESCRIPTION = "A very small and simple helper to create usage messages"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://usage.meta;md5=286b5f7c463236450d0a9b4a740fbe00"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/usage/usage-${PV}.tar.gz"

SRC_URI[md5sum] = "a3b9758815d67c1829dc80c457723134"
SRC_URI[sha256sum] = "0ca77d94b7836085e9a900c764d440a2e84d1be3dae8313da56f8ca667b139a4"

S = "${WORKDIR}/usage-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
