SECTION = "devel/chicken"
DESCRIPTION = "Utilities to help testing servers"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://server-test.meta;md5=85223759dd4e539ca85c30c1d4c257cc"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "2098694af4dae9fd46cf3a91417120a6"
SRC_URI[sha256sum] = "e7a95c4d249061506eb7df5269dee39a19194fbe18ddf5603ad8a1a680937edc"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
