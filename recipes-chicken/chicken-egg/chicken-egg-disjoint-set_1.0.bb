SECTION = "devel/chicken"
DESCRIPTION = "Disjoint set datastructure"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://disjoint-set.meta;md5=e64766f7dc1da7734c4fa835eb6c7571"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/disjoint-set/disjoint-set-${PV}.tar.gz"

SRC_URI[md5sum] = "aa9e77eeb62ff025dd313aac88a847e2"
SRC_URI[sha256sum] = "6fe76274c50d7d155429fe7cc6597eb363e8858d813b7ae00e81b4bb66262304"

S = "${WORKDIR}/disjoint-set-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
