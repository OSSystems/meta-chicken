SECTION = "devel/chicken"
DESCRIPTION = "Sending a file over the network"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://sendfile.meta;md5=c300507a211b909bdc69815095359a79"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "6c6bb5b40b8c43040758dc65c6268054"
SRC_URI[sha256sum] = "a06686410c19ab16a5bef11115de00eb9cd97450946fd59003745d89566308a4"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
