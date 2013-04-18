SECTION = "devel/chicken"
DESCRIPTION = "Sending a file over the network"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://sendfile.meta;md5=c547bb74c1ab1de0f2834318b7a4bf73"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "ed4890e0ee3a90172716d513e61d80ff"
SRC_URI[sha256sum] = "d74842929354bd1f682dbecf0aca78325cb072dd0564f8398f392977e21c3da4"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
