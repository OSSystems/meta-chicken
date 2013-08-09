SECTION = "devel/chicken"
DESCRIPTION = "Colorize programming code as HTML"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://colorize.meta;md5=67cab41305f064905e704435a4e968b1"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "f46951fe13cd3eae9247d5162a0c893c"
SRC_URI[sha256sum] = "d7daf7af381f8fbbe7008d7fe66d5e3adfec7083030b07013458373eebe446d0"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
